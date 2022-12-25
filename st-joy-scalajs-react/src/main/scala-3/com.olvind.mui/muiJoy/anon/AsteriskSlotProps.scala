package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.formLabelFormLabelPropsMod.FormLabelOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsteriskSlotProps extends StObject {
  
  var asterisk: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, FormLabelOwnerState]
  
  var root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["label", js.Object, FormLabelOwnerState]
}
object AsteriskSlotProps {
  
  inline def apply(
    asterisk: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, FormLabelOwnerState],
    root: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["label", js.Object, FormLabelOwnerState]
  ): AsteriskSlotProps = {
    val __obj = js.Dynamic.literal(asterisk = asterisk.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsteriskSlotProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsteriskSlotProps] (val x: Self) extends AnyVal {
    
    inline def setAsterisk(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, FormLabelOwnerState]): Self = StObject.set(x, "asterisk", value.asInstanceOf[js.Any])
    
    inline def setAsteriskFunction1(
      value: FormLabelOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "asterisk", js.Any.fromFunction1(value))
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["label", js.Object, FormLabelOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: FormLabelOwnerState => (Omit[ComponentPropsWithRef["label"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
  }
}
