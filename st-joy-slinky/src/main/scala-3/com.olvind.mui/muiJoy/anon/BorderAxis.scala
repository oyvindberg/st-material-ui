package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiJoy.tableTablePropsMod.TablePropsBorderAxisOverrides
import com.olvind.mui.muiJoy.tableTablePropsMod.TablePropsColorOverrides
import com.olvind.mui.muiJoy.tableTablePropsMod.TablePropsSizeOverrides
import com.olvind.mui.muiJoy.tableTablePropsMod.TablePropsVariantOverrides
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.std.Record
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderAxis extends StObject {
  
  /**
    * The axis to display a border on the table cell.
    * @default 'xBetween'
    */
  var borderAxis: js.UndefOr[
    OverridableStringUnion[
      "none" | "x" | "xBetween" | "y" | "yBetween" | "both" | "bothBetween", 
      TablePropsBorderAxisOverrides
    ]
  ] = js.undefined
  
  /**
    * Children of the table
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'neutral'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, TablePropsColorOverrides]] = js.undefined
  
  /**
    * If `true`, the table row will shade on hover.
    * @default false
    */
  var hoverRow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the body cells will not wrap, but instead will truncate with a text overflow ellipsis.
    *
    * Note: Header cells are always truncated with overflow ellipsis.
    *
    * @default false
    */
  var noWrap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the component.
    * It accepts theme values between 'sm' and 'lg'.
    * @default 'md'
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", TablePropsSizeOverrides]] = js.undefined
  
  /**
    * Set the header sticky.
    *
    * ⚠️ It doesn't work with IE11.
    * @default false
    */
  var stickyHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The odd or even row of the table body will have subtle background color.
    */
  var stripe: js.UndefOr["odd" | "even" | (String & (Record[scala.Nothing, scala.Nothing]))] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The [global variant](https://mui.com/joy-ui/main-features/global-variants/) to use.
    * @default 'plain'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, TablePropsVariantOverrides]] = js.undefined
}
object BorderAxis {
  
  inline def apply(): BorderAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderAxis] (val x: Self) extends AnyVal {
    
    inline def setBorderAxis(
      value: OverridableStringUnion[
          "none" | "x" | "xBetween" | "y" | "yBetween" | "both" | "bothBetween", 
          TablePropsBorderAxisOverrides
        ]
    ): Self = StObject.set(x, "borderAxis", value.asInstanceOf[js.Any])
    
    inline def setBorderAxisUndefined: Self = StObject.set(x, "borderAxis", js.undefined)
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, TablePropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHoverRow(value: Boolean): Self = StObject.set(x, "hoverRow", value.asInstanceOf[js.Any])
    
    inline def setHoverRowUndefined: Self = StObject.set(x, "hoverRow", js.undefined)
    
    inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", TablePropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStickyHeader(value: Boolean): Self = StObject.set(x, "stickyHeader", value.asInstanceOf[js.Any])
    
    inline def setStickyHeaderUndefined: Self = StObject.set(x, "stickyHeader", js.undefined)
    
    inline def setStripe(value: "odd" | "even" | (String & (Record[scala.Nothing, scala.Nothing]))): Self = StObject.set(x, "stripe", value.asInstanceOf[js.Any])
    
    inline def setStripeUndefined: Self = StObject.set(x, "stripe", js.undefined)
    
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
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, TablePropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
