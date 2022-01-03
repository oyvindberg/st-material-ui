package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.absolute
import com.olvind.mui.muiMaterial.muiMaterialStrings.fixed
import com.olvind.mui.muiMaterial.muiMaterialStrings.relative
import com.olvind.mui.muiMaterial.muiMaterialStrings.static
import com.olvind.mui.muiMaterial.muiMaterialStrings.sticky
import com.olvind.mui.muiMaterial.muiMaterialStrings.transparent
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classes extends StObject {
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialAppBarClasses] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'primary'
    */
  var color: js.UndefOr[com.olvind.mui.muiMaterial.mod.PropTypes.Color | transparent] = js.undefined
  
  /**
    * If true, the `color` prop is applied in dark mode.
    * @default false
    */
  var enableColorOnDark: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The positioning type. The behavior of the different options is described
    * [in the MDN web docs](https://developer.mozilla.org/en-US/docs/Learn/CSS/CSS_layout/Positioning).
    * Note: `sticky` is not universally supported and will fall back to `static` when unavailable.
    * @default 'fixed'
    */
  var position: js.UndefOr[fixed | absolute | sticky | static | relative] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.undefined
}
object Classes {
  
  inline def apply(): Classes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classes]
  }
  
  extension [Self <: Classes](x: Self) {
    
    inline def setClasses(value: PartialAppBarClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColor(value: com.olvind.mui.muiMaterial.mod.PropTypes.Color | transparent): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEnableColorOnDark(value: Boolean): Self = StObject.set(x, "enableColorOnDark", value.asInstanceOf[js.Any])
    
    inline def setEnableColorOnDarkUndefined: Self = StObject.set(x, "enableColorOnDark", js.undefined)
    
    inline def setPosition(value: fixed | absolute | sticky | static | relative): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSx(value: SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiMaterial.createThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
  }
}
