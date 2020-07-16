package tr.havelsan.ueransim.ngap4.ies.octet_strings;

import tr.havelsan.ueransim.ngap4.core.NgapOctetString;

public class NGAP_EmergencyAreaID extends NgapOctetString {

    @Override
    protected String getAsnName() {
        return "EmergencyAreaID";
    }

    @Override
    protected String getXmlTagName() {
        return "EmergencyAreaID";
    }
}
