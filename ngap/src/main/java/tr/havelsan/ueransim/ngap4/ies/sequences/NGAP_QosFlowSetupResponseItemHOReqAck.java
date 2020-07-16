package tr.havelsan.ueransim.ngap4.ies.sequences;

import tr.havelsan.ueransim.ngap4.core.NgapSequence;
import tr.havelsan.ueransim.ngap4.ies.enumerations.NGAP_DataForwardingAccepted;
import tr.havelsan.ueransim.ngap4.ies.integers.NGAP_QosFlowIdentifier;

public class NGAP_QosFlowSetupResponseItemHOReqAck extends NgapSequence {

    public NGAP_QosFlowIdentifier qosFlowIdentifier;
    public NGAP_DataForwardingAccepted dataForwardingAccepted;

    @Override
    protected String getAsnName() {
        return "QosFlowSetupResponseItemHOReqAck";
    }

    @Override
    protected String getXmlTagName() {
        return "QosFlowSetupResponseItemHOReqAck";
    }

    @Override
    protected String[] getMemberNames() {
        return new String[]{"qosFlowIdentifier", "dataForwardingAccepted"};
    }

    @Override
    protected String[] getMemberIdentifiers() {
        return new String[]{"qosFlowIdentifier", "dataForwardingAccepted"};
    }
}
