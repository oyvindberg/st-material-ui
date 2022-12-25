package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.alertAlertPropsMod.AlertOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDecorator extends StObject {
  
  var endDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, AlertOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, AlertOwnerState]
  
  var startDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, AlertOwnerState]
}
object StartDecorator {
  
  inline def apply(
    endDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, AlertOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, AlertOwnerState],
    startDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, AlertOwnerState]
  ): StartDecorator = {
    val __obj = js.Dynamic.literal(endDecorator = endDecorator.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDecorator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDecorator] (val x: Self) extends AnyVal {
    
    inline def setEndDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, AlertOwnerState]): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: AlertOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, AlertOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: AlertOwnerState => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setStartDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, AlertOwnerState]): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: AlertOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
  }
}
