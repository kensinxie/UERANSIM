package tr.havelsan.ueransim.ngap4.ies.octet_strings;

import tr.havelsan.ueransim.ngap4.core.NgapOctetString;

public class NGAP_RoutingID extends NgapOctetString {

    @Override
    protected String getAsnName() {
        return "RoutingID";
    }

    @Override
    protected String getXmlTagName() {
        return "RoutingID";
    }
}
