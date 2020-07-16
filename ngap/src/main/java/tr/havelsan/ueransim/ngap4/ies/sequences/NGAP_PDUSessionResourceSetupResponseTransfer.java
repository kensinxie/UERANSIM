package tr.havelsan.ueransim.ngap4.ies.sequences;

import tr.havelsan.ueransim.ngap4.core.NgapSequence;
import tr.havelsan.ueransim.ngap4.ies.sequence_ofs.NGAP_QosFlowList;

public class NGAP_PDUSessionResourceSetupResponseTransfer extends NgapSequence {

    public NGAP_QosFlowPerTNLInformation qosFlowPerTNLInformation;
    public NGAP_QosFlowPerTNLInformation additionalQosFlowPerTNLInformation;
    public NGAP_SecurityResult securityResult;
    public NGAP_QosFlowList qosFlowFailedToSetupList;

    @Override
    protected String getAsnName() {
        return "PDUSessionResourceSetupResponseTransfer";
    }

    @Override
    protected String getXmlTagName() {
        return "PDUSessionResourceSetupResponseTransfer";
    }

    @Override
    protected String[] getMemberNames() {
        return new String[]{"qosFlowPerTNLInformation", "additionalQosFlowPerTNLInformation", "securityResult", "qosFlowFailedToSetupList"};
    }

    @Override
    protected String[] getMemberIdentifiers() {
        return new String[]{"qosFlowPerTNLInformation", "additionalQosFlowPerTNLInformation", "securityResult", "qosFlowFailedToSetupList"};
    }
}
