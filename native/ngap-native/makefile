BASE_FLAGS = -Wall -O2 -fPIC -DASN_DISABLE_OER_SUPPORT

libngap-native.so: libngap-generated.a libngap-basis.a
	g++ -shared $(BASE_FLAGS) -o libngap-native.so -Wl,--whole-archive libngap-basis.a -Wl,--no-whole-archive libngap-generated.a

libngap-generated.a: $(wildcard src/asn_generated/*.c) $(wildcard src/asn_generated/*.h)
	cd src/asn_generated && gcc -c $(BASE_FLAGS) -I. *.c
	cd src/asn_generated && ar rcs libngap-generated.a *.o
	mv src/asn_generated/libngap-generated.a ./

libngap-basis.a: $(wildcard src/*.cpp) $(wildcard src/*.h)
	cd src/ && g++ -c $(BASE_FLAGS) -I"$(JAVA_HOME)"/include -I"$(JAVA_HOME)"/include/linux -I./asn_generated *.cpp
	cd src/ && ar rcs libngap-basis.a *.o
	mv src/libngap-basis.a ./

clean:
	rm -f ./src/asn_generated/*.o
	rm -f ./src/asn_generated/*.a
	rm -f ./src/*.o
	rm -f ./src/*.a
	rm -f *.o *.so *.a
