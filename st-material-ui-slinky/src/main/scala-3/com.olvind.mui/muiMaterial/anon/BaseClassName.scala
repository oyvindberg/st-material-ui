package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseClassName extends StObject {
  
  /**
    * The base class applied to the icon. Defaults to 'material-icons', but can be changed to any
    * other base class that suits the icon font you're using (e.g. material-icons-rounded, fas, etc).
    * @default 'material-icons'
    */
  var baseClassName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the icon font ligature.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialIconClasses] = js.undefined
  
  /**
    * The color of the component.
    * It supports both default and custom theme colors, which can be added as shown in the
    * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
    * @default 'inherit'
    */
  var color: js.UndefOr[
    "inherit" | "action" | "disabled" | "primary" | "secondary" | "error" | "info" | "success" | "warning"
  ] = js.undefined
  
  /**
    * The fontSize applied to the icon. Defaults to 24px, but can be configure to inherit font size.
    * @default 'medium'
    */
  var fontSize: js.UndefOr["inherit" | "large" | "medium" | "small"] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[Theme]] = js.undefined
}
object BaseClassName {
  
  inline def apply(): BaseClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseClassName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseClassName] (val x: Self) extends AnyVal {
    
    inline def setBaseClassName(value: String): Self = StObject.set(x, "baseClassName", value.asInstanceOf[js.Any])
    
    inline def setBaseClassNameUndefined: Self = StObject.set(x, "baseClassName", js.undefined)
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClasses(value: PartialIconClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColor(
      value: "inherit" | "action" | "disabled" | "primary" | "secondary" | "error" | "info" | "success" | "warning"
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontSize(value: "inherit" | "large" | "medium" | "small"): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
  }
}
