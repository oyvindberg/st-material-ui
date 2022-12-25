package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.formLabelFormLabelPropsMod.FormLabelOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'label', {}, @mui/joy.@mui/joy/FormLabel/FormLabelProps.FormLabelOwnerState>,   asterisk :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/FormLabel/FormLabelProps.FormLabelOwnerState>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'label', {}, @mui/joy.@mui/joy/FormLabel/FormLabelProps.FormLabelOwnerState>,   asterisk :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/FormLabel/FormLabelProps.FormLabelOwnerState>}[P]} */
trait AsteriskRoot extends StObject {
  
  var asterisk: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, FormLabelOwnerState]
  ] = js.undefined
  
  var root: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["label", js.Object, FormLabelOwnerState]
  ] = js.undefined
}
object AsteriskRoot {
  
  inline def apply(): AsteriskRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsteriskRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsteriskRoot] (val x: Self) extends AnyVal {
    
    inline def setAsterisk(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, FormLabelOwnerState]): Self = StObject.set(x, "asterisk", value.asInstanceOf[js.Any])
    
    inline def setAsteriskFunction1(
      value: FormLabelOwnerState => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "asterisk", js.Any.fromFunction1(value))
    
    inline def setAsteriskUndefined: Self = StObject.set(x, "asterisk", js.undefined)
    
    inline def setRoot(value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["label", js.Object, FormLabelOwnerState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: FormLabelOwnerState => (Omit[ComponentPropsWithRef["label"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
