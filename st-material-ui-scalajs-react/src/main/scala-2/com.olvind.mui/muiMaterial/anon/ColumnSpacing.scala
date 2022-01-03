package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.gridGridMod.GridDirection
import com.olvind.mui.muiMaterial.gridGridMod.GridSize
import com.olvind.mui.muiMaterial.gridGridMod.GridSpacing
import com.olvind.mui.muiMaterial.gridGridMod.GridWrap
import com.olvind.mui.muiSystem.mod.ResponsiveStyleValue
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnSpacing extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialGridClasses] = js.native
  
  /**
    * Defines the horizontal space between the type `item` components.
    * It overrides the value of the `spacing` prop.
    */
  var columnSpacing: js.UndefOr[ResponsiveStyleValue[GridSpacing]] = js.native
  
  /**
    * The number of columns.
    * @default 12
    */
  var columns: js.UndefOr[ResponsiveStyleValue[Double]] = js.native
  
  /**
    * If `true`, the component will have the flex *container* behavior.
    * You should be wrapping *items* with a *container*.
    * @default false
    */
  var container: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines the `flex-direction` style property.
    * It is applied for all screen sizes.
    * @default 'row'
    */
  var direction: js.UndefOr[ResponsiveStyleValue[GridDirection]] = js.native
  
  /**
    * If `true`, the component will have the flex *item* behavior.
    * You should be wrapping *items* with a *container*.
    * @default false
    */
  var item: js.UndefOr[Boolean] = js.native
  
  /**
    * If a number, it sets the number of columns the grid item uses.
    * It can't be greater than the total number of columns of the container (12 by default).
    * If 'auto', the grid item's width matches its content.
    * If false, the prop is ignored.
    * If true, the grid item's width grows to use the space available in the grid container.
    * The value is applied for the `lg` breakpoint and wider screens if not overridden.
    * @default false
    */
  var lg: js.UndefOr[Boolean | GridSize] = js.native
  
  /**
    * If a number, it sets the number of columns the grid item uses.
    * It can't be greater than the total number of columns of the container (12 by default).
    * If 'auto', the grid item's width matches its content.
    * If false, the prop is ignored.
    * If true, the grid item's width grows to use the space available in the grid container.
    * The value is applied for the `md` breakpoint and wider screens if not overridden.
    * @default false
    */
  var md: js.UndefOr[Boolean | GridSize] = js.native
  
  /**
    * Defines the vertical space between the type `item` components.
    * It overrides the value of the `spacing` prop.
    */
  var rowSpacing: js.UndefOr[ResponsiveStyleValue[GridSpacing]] = js.native
  
  /**
    * If a number, it sets the number of columns the grid item uses.
    * It can't be greater than the total number of columns of the container (12 by default).
    * If 'auto', the grid item's width matches its content.
    * If false, the prop is ignored.
    * If true, the grid item's width grows to use the space available in the grid container.
    * The value is applied for the `sm` breakpoint and wider screens if not overridden.
    * @default false
    */
  var sm: js.UndefOr[Boolean | GridSize] = js.native
  
  /**
    * Defines the space between the type `item` components.
    * It can only be used on a type `container` component.
    * @default 0
    */
  var spacing: js.UndefOr[ResponsiveStyleValue[GridSpacing]] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
  
  /**
    * Defines the `flex-wrap` style property.
    * It's applied for all screen sizes.
    * @default 'wrap'
    */
  var wrap: js.UndefOr[GridWrap] = js.native
  
  /**
    * If a number, it sets the number of columns the grid item uses.
    * It can't be greater than the total number of columns of the container (12 by default).
    * If 'auto', the grid item's width matches its content.
    * If false, the prop is ignored.
    * If true, the grid item's width grows to use the space available in the grid container.
    * The value is applied for the `xl` breakpoint and wider screens if not overridden.
    * @default false
    */
  var xl: js.UndefOr[Boolean | GridSize] = js.native
  
  /**
    * If a number, it sets the number of columns the grid item uses.
    * It can't be greater than the total number of columns of the container (12 by default).
    * If 'auto', the grid item's width matches its content.
    * If false, the prop is ignored.
    * If true, the grid item's width grows to use the space available in the grid container.
    * The value is applied for all the screen sizes with the lowest priority.
    * @default false
    */
  var xs: js.UndefOr[Boolean | GridSize] = js.native
  
  /**
    * If `true`, it sets `min-width: 0` on the item.
    * Refer to the limitations section of the documentation to better understand the use case.
    * @default false
    */
  var zeroMinWidth: js.UndefOr[Boolean] = js.native
}
object ColumnSpacing {
  
  @scala.inline
  def apply(): ColumnSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSpacing]
  }
  
  @scala.inline
  implicit class ColumnSpacingMutableBuilder[Self <: ColumnSpacing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setClasses(value: PartialGridClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setColumnSpacing(value: ResponsiveStyleValue[GridSpacing]): Self = StObject.set(x, "columnSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSpacingUndefined: Self = StObject.set(x, "columnSpacing", js.undefined)
    
    @scala.inline
    def setColumnSpacingVarargs(value: (GridSpacing | Null)*): Self = StObject.set(x, "columnSpacing", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: ResponsiveStyleValue[Double]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: (Double | Null)*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setContainer(value: Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setDirection(value: ResponsiveStyleValue[GridDirection]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDirectionVarargs(value: (GridDirection | Null)*): Self = StObject.set(x, "direction", js.Array(value :_*))
    
    @scala.inline
    def setItem(value: Boolean): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setLg(value: Boolean | GridSize): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
    
    @scala.inline
    def setMd(value: Boolean | GridSize): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
    
    @scala.inline
    def setRowSpacing(value: ResponsiveStyleValue[GridSpacing]): Self = StObject.set(x, "rowSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpacingUndefined: Self = StObject.set(x, "rowSpacing", js.undefined)
    
    @scala.inline
    def setRowSpacingVarargs(value: (GridSpacing | Null)*): Self = StObject.set(x, "rowSpacing", js.Array(value :_*))
    
    @scala.inline
    def setSm(value: Boolean | GridSize): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
    
    @scala.inline
    def setSpacing(value: ResponsiveStyleValue[GridSpacing]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setSpacingVarargs(value: (GridSpacing | Null)*): Self = StObject.set(x, "spacing", js.Array(value :_*))
    
    @scala.inline
    def setSx(value: SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSxFunction1(
      value: com.olvind.mui.muiMaterial.createThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSxNull: Self = StObject.set(x, "sx", null)
    
    @scala.inline
    def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    @scala.inline
    def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value :_*))
    
    @scala.inline
    def setWrap(value: GridWrap): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    
    @scala.inline
    def setXl(value: Boolean | GridSize): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
    
    @scala.inline
    def setXs(value: Boolean | GridSize): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
    
    @scala.inline
    def setZeroMinWidth(value: Boolean): Self = StObject.set(x, "zeroMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroMinWidthUndefined: Self = StObject.set(x, "zeroMinWidth", js.undefined)
  }
}
