package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiBase.anon.PartialSliderUnstyledClasses
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[js.UndefOr[PartialSliderUnstyledClasses] & ColorPrimary] = js.undefined
  
  /**
    * The color of the component.
    * It supports both default and custom theme colors, which can be added as shown in the
    * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
    * @default 'primary'
    */
  var color: js.UndefOr["primary" | "secondary"] = js.undefined
  
  /**
    * The components used for each slot inside.
    *
    * This prop is an alias for the `slots` prop.
    * It's recommended to use the `slots` prop instead.
    *
    * @default {}
    */
  var components: js.UndefOr[Mark] = js.undefined
  
  /**
    * The extra props for the slot components.
    * You can override the existing props or add new ones.
    *
    * This prop is an alias for the `slotProps` prop.
    * It's recommended to use the `slotProps` prop instead, as `componentsProps` will be deprecated in the future.
    *
    * @default {}
    */
  var componentsProps: js.UndefOr[com.olvind.mui.muiBase.anon.Mark] = js.undefined
  
  /**
    * The size of the slider.
    * @default 'medium'
    */
  var size: js.UndefOr["small" | "medium"] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]] = js.undefined
}
object Size {
  
  inline def apply(): Size = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: js.UndefOr[PartialSliderUnstyledClasses] & ColorPrimary): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColor(value: "primary" | "secondary"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setComponents(value: Mark): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsProps(value: com.olvind.mui.muiBase.anon.Mark): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
    
    inline def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setSize(value: "small" | "medium"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSx(value: SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
  }
}
