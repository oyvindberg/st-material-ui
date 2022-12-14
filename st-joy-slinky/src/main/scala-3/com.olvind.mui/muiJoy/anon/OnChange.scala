package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiJoy.tabTabPropsMod.TabPropsColorOverrides
import com.olvind.mui.muiJoy.tabTabPropsMod.TabPropsVariantOverrides
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange extends StObject {
  
  /**
    * A ref for imperative actions. It currently only supports `focusVisible()` action.
    */
  var action: js.UndefOr[com.olvind.mui.react.mod.Ref[FocusVisible]] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'neutral'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, TabPropsColorOverrides]] = js.undefined
  
  /**
    * If `true`, the component is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Callback invoked when new value is being set.
    */
  var onChange: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Event, Element], /* value */ Double | String, Unit]
  ] = js.undefined
  
  /**
    * The content direction flow.
    * @default 'horizontal'
    */
  var orientation: js.UndefOr["horizontal" | "vertical"] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * You can provide your own value. Otherwise, we fall back to the child position index.
    */
  var value: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The [global variant](https://mui.com/joy-ui/main-features/global-variants/) to use.
    * @default 'plain'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, TabPropsVariantOverrides]] = js.undefined
}
object OnChange {
  
  inline def apply(): OnChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnChange] (val x: Self) extends AnyVal {
    
    inline def setAction(value: com.olvind.mui.react.mod.Ref[FocusVisible]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(value: /* instance */ FocusVisible | Null => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionReactRef(value: ReactRef[FocusVisible]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, TabPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnChange(value: (/* event */ SyntheticEvent[Event, Element], /* value */ Double | String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOrientation(value: "horizontal" | "vertical"): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
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
    
    inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, TabPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
