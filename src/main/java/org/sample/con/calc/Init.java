package org.sample.con.calc;

import org.ballerinalang.bre.Context;
import org.ballerinalang.connector.api.AbstractNativeAction;
import org.ballerinalang.connector.api.ConnectorFuture;
import org.ballerinalang.model.types.TypeKind;
import org.ballerinalang.nativeimpl.actions.ClientConnectorFuture;
import org.ballerinalang.natives.annotations.Argument;
import org.ballerinalang.natives.annotations.BallerinaAction;

@BallerinaAction(packageName = "sample.con.calculator",
                 actionName = "<init>",
                 connectorName = "CalculatorConnector",
                 args = {
                         @Argument(name = "c",
                                   type = TypeKind.CONNECTOR)
                 })
public class Init extends AbstractNativeAction {

    @Override
    public ConnectorFuture execute(Context context) {
        System.out.println("********************** Action init called **********************");
        ClientConnectorFuture future = new ClientConnectorFuture();
        future.notifySuccess();
        return future;
    }
}
