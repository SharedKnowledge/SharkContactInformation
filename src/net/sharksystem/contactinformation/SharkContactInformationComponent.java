package net.sharksystem.contactinformation;

import net.sharksystem.ASAPFormats;
import net.sharksystem.SharkComponent;

@ASAPFormats(formats = {SharkContactInformationComponent.SHARK_CONTACTINFORMATION_FORMAT})
public interface SharkContactInformationComponent extends SharkComponent {
    String SHARK_CONTACTINFORMATION_FORMAT = "shark/contactinformation";

    /**
     * Publish (new) addresses of this peer. Those addresses are now propagated through the ASAP network
     * @param contactInformation new addresses - former addresses are overwritten
     * @throws SharkContactInformationException unclear now
     */
    void publishContactInformation(SharkContactInformation contactInformation) throws SharkContactInformationException;

    /**
     * Get contact information.
     * @param peerID peer id
     * @return addresses of this peer
     * @throws SharkContactInformationException no information available
     */
    SharkContactInformation getSharkContactInformation(String peerID) throws SharkContactInformationException;
}
