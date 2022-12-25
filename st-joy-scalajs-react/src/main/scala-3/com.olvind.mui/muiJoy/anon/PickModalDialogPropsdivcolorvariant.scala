package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.modalDialogModalDialogPropsMod.ModalDialogPropsColorOverrides
import com.olvind.mui.muiJoy.modalDialogModalDialogPropsMod.ModalDialogPropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<ModalDialogProps<'div', {}>, 'color' | 'variant'> */
trait PickModalDialogPropsdivcolorvariant extends StObject {
  
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, ModalDialogPropsColorOverrides]] = js.undefined
  
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, ModalDialogPropsVariantOverrides]] = js.undefined
}
object PickModalDialogPropsdivcolorvariant {
  
  inline def apply(): PickModalDialogPropsdivcolorvariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickModalDialogPropsdivcolorvariant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickModalDialogPropsdivcolorvariant] (val x: Self) extends AnyVal {
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, ModalDialogPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, ModalDialogPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
