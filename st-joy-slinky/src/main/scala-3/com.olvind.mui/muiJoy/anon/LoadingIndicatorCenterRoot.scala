package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.buttonButtonPropsMod.ButtonOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingIndicatorCenterRoot extends StObject {
  
  var endDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ButtonOwnerState]
  
  var loadingIndicatorCenter: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ButtonOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", js.Object, ButtonOwnerState]
  
  var startDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ButtonOwnerState]
}
object LoadingIndicatorCenterRoot {
  
  inline def apply(
    endDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ButtonOwnerState],
    loadingIndicatorCenter: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ButtonOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", js.Object, ButtonOwnerState],
    startDecorator: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ButtonOwnerState]
  ): LoadingIndicatorCenterRoot = {
    val __obj = js.Dynamic.literal(endDecorator = endDecorator.asInstanceOf[js.Any], loadingIndicatorCenter = loadingIndicatorCenter.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingIndicatorCenterRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadingIndicatorCenterRoot] (val x: Self) extends AnyVal {
    
    inline def setEndDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ButtonOwnerState]): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: ButtonOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setLoadingIndicatorCenter(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ButtonOwnerState]): Self = StObject.set(x, "loadingIndicatorCenter", value.asInstanceOf[js.Any])
    
    inline def setLoadingIndicatorCenterFunction1(
      value: ButtonOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "loadingIndicatorCenter", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", js.Object, ButtonOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: ButtonOwnerState => (Omit[ComponentPropsWithRef["button"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setStartDecorator(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, ButtonOwnerState]): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: ButtonOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
  }
}
