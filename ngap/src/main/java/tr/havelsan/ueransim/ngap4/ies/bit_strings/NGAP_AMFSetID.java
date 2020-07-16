package tr.havelsan.ueransim.ngap4.ies.bit_strings;

import tr.havelsan.ueransim.ngap4.core.NgapBitString;

public class NGAP_AMFSetID extends NgapBitString {

    @Override
    protected String getAsnName() {
        return "AMFSetID";
    }

    @Override
    protected String getXmlTagName() {
        return "AMFSetID";
    }
}
