package org.sample.con.calc;

import org.ballerinalang.bre.Context;
import org.ballerinalang.connector.api.AbstractNativeAction;
import org.ballerinalang.connector.api.ConnectorFuture;
import org.ballerinalang.model.types.TypeKind;
import org.ballerinalang.model.values.BInteger;
import org.ballerinalang.nativeimpl.actions.ClientConnectorFuture;
import org.ballerinalang.natives.annotations.Argument;
import org.ballerinalang.natives.annotations.BallerinaAction;
import org.ballerinalang.natives.annotations.ReturnType;

@BallerinaAction(
        packageName = "sample.con.calculator",
        actionName = "add",
        connectorName = "CalculatorConnector",
        args = {
                @Argument(name = "value1",
                        type = TypeKind.INT),
                @Argument(name = "value2",
                        type = TypeKind.INT)
        },
        returnType = {
                @ReturnType(type = TypeKind.INT)
        }
)
public class Add extends AbstractNativeAction {

    @Override
    public ConnectorFuture execute(Context context) {
        ClientConnectorFuture future = new ClientConnectorFuture();
        //Implement your logic here
        System.out.println("### Action add called ###");
        int arg1 = getIntArgument(context, 0);
        int arg2 = getIntArgument(context, 1);
        int result = arg1 + arg2;
        BInteger valueToReturn = new BInteger(result);
        future.notifyReply(valueToReturn);
        return future;
    }
}
