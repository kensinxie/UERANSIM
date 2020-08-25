/*
 * MIT License
 *
 * Copyright (c) 2020 ALİ GÜNGÖR
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package tr.havelsan.ueransim.app.api.gnb.sctp;

import tr.havelsan.ueransim.app.core.GnbSimContext;
import tr.havelsan.ueransim.app.events.gnb.SctpAssociationSetupEvent;
import tr.havelsan.ueransim.sctp.ISctpAssociationHandler;
import tr.havelsan.ueransim.sctp.SctpAssociation;
import tr.havelsan.ueransim.app.structs.Guami;

public class NgapSctpAssociationHandler implements ISctpAssociationHandler {
    private final GnbSimContext gnbCtx;
    private final Guami guami;

    public NgapSctpAssociationHandler(GnbSimContext gnbCtx, Guami guami) {
        this.gnbCtx = gnbCtx;
        this.guami = guami;
    }

    @Override
    public void onSetup(SctpAssociation association) {
        gnbCtx.pushEvent(new SctpAssociationSetupEvent(guami, association));
    }

    @Override
    public void onShutdown() {

    }
}
