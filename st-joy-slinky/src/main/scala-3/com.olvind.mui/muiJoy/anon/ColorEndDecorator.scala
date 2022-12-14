package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiJoy.switchSwitchPropsMod.SwitchOwnerState
import com.olvind.mui.muiJoy.switchSwitchPropsMod.SwitchPropsColorOverrides
import com.olvind.mui.muiJoy.switchSwitchPropsMod.SwitchPropsSizeOverrides
import com.olvind.mui.muiJoy.switchSwitchPropsMod.SwitchPropsVariantOverrides
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorEndDecorator extends StObject {
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'neutral'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, SwitchPropsColorOverrides]] = js.undefined
  
  /**
    * The element that appears at the end of the switch.
    */
  var endDecorator: js.UndefOr[ReactElement | (js.Function1[/* ownerState */ SwitchOwnerState, ReactElement])] = js.undefined
  
  /**
    * The size of the component.
    * @default 'md'
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", SwitchPropsSizeOverrides]] = js.undefined
  
  /**
    * The element that appears at the end of the switch.
    */
  var startDecorator: js.UndefOr[ReactElement | (js.Function1[/* ownerState */ SwitchOwnerState, ReactElement])] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The [global variant](https://mui.com/joy-ui/main-features/global-variants/) to use.
    * @default 'solid'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, SwitchPropsVariantOverrides]] = js.undefined
}
object ColorEndDecorator {
  
  inline def apply(): ColorEndDecorator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorEndDecorator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorEndDecorator] (val x: Self) extends AnyVal {
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, SwitchPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndDecorator(value: ReactElement | (js.Function1[/* ownerState */ SwitchOwnerState, ReactElement])): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(value: /* ownerState */ SwitchOwnerState => ReactElement): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setEndDecoratorReactElement(value: ReactElement): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", SwitchPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStartDecorator(value: ReactElement | (js.Function1[/* ownerState */ SwitchOwnerState, ReactElement])): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(value: /* ownerState */ SwitchOwnerState => ReactElement): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
    
    inline def setStartDecoratorReactElement(value: ReactElement): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
    
    inline def setSx(value: SxProps): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, SwitchPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
