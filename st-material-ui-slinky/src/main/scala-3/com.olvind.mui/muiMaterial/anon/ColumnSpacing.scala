package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.gridGridMod.GridDirection
import com.olvind.mui.muiMaterial.gridGridMod.GridSpacing
import com.olvind.mui.muiMaterial.gridGridMod.GridWrap
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.mod.ResponsiveStyleValue
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSpacing extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialGridClasses] = js.undefined
  
  /**
    * Defines the horizontal space between the type `item` components.
    * It overrides the value of the `spacing` prop.
    */
  var columnSpacing: js.UndefOr[ResponsiveStyleValue[GridSpacing]] = js.undefined
  
  /**
    * The number of columns.
    * @default 12
    */
  var columns: js.UndefOr[ResponsiveStyleValue[Double]] = js.undefined
  
  /**
    * If `true`, the component will have the flex *container* behavior.
    * You should be wrapping *items* with a *container*.
    * @default false
    */
  var container: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the `flex-direction` style property.
    * It is applied for all screen sizes.
    * @default 'row'
    */
  var direction: js.UndefOr[ResponsiveStyleValue[GridDirection]] = js.undefined
  
  /**
    * If `true`, the component will have the flex *item* behavior.
    * You should be wrapping *items* with a *container*.
    * @default false
    */
  var item: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the vertical space between the type `item` components.
    * It overrides the value of the `spacing` prop.
    */
  var rowSpacing: js.UndefOr[ResponsiveStyleValue[GridSpacing]] = js.undefined
  
  /**
    * Defines the space between the type `item` components.
    * It can only be used on a type `container` component.
    * @default 0
    */
  var spacing: js.UndefOr[ResponsiveStyleValue[GridSpacing]] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[Theme]] = js.undefined
  
  /**
    * Defines the `flex-wrap` style property.
    * It's applied for all screen sizes.
    * @default 'wrap'
    */
  var wrap: js.UndefOr[GridWrap] = js.undefined
  
  /**
    * If `true`, it sets `min-width: 0` on the item.
    * Refer to the limitations section of the documentation to better understand the use case.
    * @default false
    */
  var zeroMinWidth: js.UndefOr[Boolean] = js.undefined
}
object ColumnSpacing {
  
  inline def apply(): ColumnSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSpacing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnSpacing] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClasses(value: PartialGridClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColumnSpacing(value: ResponsiveStyleValue[GridSpacing]): Self = StObject.set(x, "columnSpacing", value.asInstanceOf[js.Any])
    
    inline def setColumnSpacingUndefined: Self = StObject.set(x, "columnSpacing", js.undefined)
    
    inline def setColumnSpacingVarargs(value: (GridSpacing | Null)*): Self = StObject.set(x, "columnSpacing", js.Array(value*))
    
    inline def setColumns(value: ResponsiveStyleValue[Double]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: (Double | Null)*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setContainer(value: Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDirection(value: ResponsiveStyleValue[GridDirection]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDirectionVarargs(value: (GridDirection | Null)*): Self = StObject.set(x, "direction", js.Array(value*))
    
    inline def setItem(value: Boolean): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setRowSpacing(value: ResponsiveStyleValue[GridSpacing]): Self = StObject.set(x, "rowSpacing", value.asInstanceOf[js.Any])
    
    inline def setRowSpacingUndefined: Self = StObject.set(x, "rowSpacing", js.undefined)
    
    inline def setRowSpacingVarargs(value: (GridSpacing | Null)*): Self = StObject.set(x, "rowSpacing", js.Array(value*))
    
    inline def setSpacing(value: ResponsiveStyleValue[GridSpacing]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setSpacingVarargs(value: (GridSpacing | Null)*): Self = StObject.set(x, "spacing", js.Array(value*))
    
    inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setWrap(value: GridWrap): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    
    inline def setZeroMinWidth(value: Boolean): Self = StObject.set(x, "zeroMinWidth", value.asInstanceOf[js.Any])
    
    inline def setZeroMinWidthUndefined: Self = StObject.set(x, "zeroMinWidth", js.undefined)
  }
}
