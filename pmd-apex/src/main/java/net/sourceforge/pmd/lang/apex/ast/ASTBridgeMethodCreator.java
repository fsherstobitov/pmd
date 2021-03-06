/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.member.bridge.BridgeMethodCreator;

public class ASTBridgeMethodCreator extends AbstractApexNode<BridgeMethodCreator> {

    public ASTBridgeMethodCreator(BridgeMethodCreator bridgeMethodCreator) {
        super(bridgeMethodCreator);
    }

    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
