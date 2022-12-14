package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.svgIconSvgIconPropsMod.SvgIconPropsSizeOverrides
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSize extends StObject {
  
  /**
    * Node passed into the SVG element.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * You can use the `htmlColor` prop to apply a color attribute to the SVG element.
    * @default 'inherit'
    */
  var color: js.UndefOr[OverridableStringUnion["inherit" | ColorPaletteProp, SvgIconPropsSizeOverrides]] = js.undefined
  
  /**
    * The fontSize applied to the icon. Defaults to 1rem, but can be configure to inherit font size.
    * @default 'xl'
    */
  var fontSize: js.UndefOr[
    OverridableStringUnion[
      "inherit" | (/* keyof @mui/joy.@mui/joy/styles/types/typography.FontSize */ String), 
      SvgIconPropsSizeOverrides
    ]
  ] = js.undefined
  
  /**
    * Applies a color attribute to the SVG element.
    */
  var htmlColor: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the root node will inherit the custom `component`'s viewBox and the `viewBox`
    * prop will be ignored.
    * Useful when you want to reference a custom `component` and have `SvgIcon` pass that
    * `component`'s viewBox to the root node.
    * @default false
    */
  var inheritViewBox: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The shape-rendering attribute. The behavior of the different options is described on the
    * [MDN Web Docs](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/shape-rendering).
    * If you are having issues with blurry icons you should investigate this prop.
    */
  var shapeRendering: js.UndefOr[String] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * Provides a human-readable title for the element that contains it.
    * https://www.w3.org/TR/SVG-access/#Equivalent
    */
  var titleAccess: js.UndefOr[String] = js.undefined
  
  /**
    * Allows you to redefine what the coordinates without units mean inside an SVG element.
    * For example, if the SVG element is 500 (width) by 200 (height),
    * and you pass viewBox="0 0 50 20",
    * this means that the coordinates inside the SVG will go from the top left corner (0,0)
    * to bottom right (50,20) and each unit will be worth 10px.
    * @default '0 0 24 24'
    */
  var viewBox: js.UndefOr[String] = js.undefined
}
object FontSize {
  
  inline def apply(): FontSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontSize] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: OverridableStringUnion["inherit" | ColorPaletteProp, SvgIconPropsSizeOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontSize(
      value: OverridableStringUnion[
          "inherit" | (/* keyof @mui/joy.@mui/joy/styles/types/typography.FontSize */ String), 
          SvgIconPropsSizeOverrides
        ]
    ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setHtmlColor(value: String): Self = StObject.set(x, "htmlColor", value.asInstanceOf[js.Any])
    
    inline def setHtmlColorUndefined: Self = StObject.set(x, "htmlColor", js.undefined)
    
    inline def setInheritViewBox(value: Boolean): Self = StObject.set(x, "inheritViewBox", value.asInstanceOf[js.Any])
    
    inline def setInheritViewBoxUndefined: Self = StObject.set(x, "inheritViewBox", js.undefined)
    
    inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
    
    inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
    
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
    
    inline def setTitleAccess(value: String): Self = StObject.set(x, "titleAccess", value.asInstanceOf[js.Any])
    
    inline def setTitleAccessUndefined: Self = StObject.set(x, "titleAccess", js.undefined)
    
    inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
  }
}
