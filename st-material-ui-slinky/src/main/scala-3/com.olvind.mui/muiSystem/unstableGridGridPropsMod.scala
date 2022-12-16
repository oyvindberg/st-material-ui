package com.olvind.mui.muiSystem

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unstableGridGridPropsMod {
  
  trait GridBaseProps
    extends StObject
       with GridDefaultBreakpoints {
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactElement] = js.undefined
    
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
      * If `true`, the negative margin and padding are apply only to the top and left sides of the grid.
      */
    var disableEqualOverflow: js.UndefOr[Boolean] = js.undefined
    
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
      * Defines the `flex-wrap` style property.
      * It's applied for all screen sizes.
      * @default 'wrap'
      */
    var wrap: js.UndefOr[GridWrap] = js.undefined
  }
  object GridBaseProps {
    
    inline def apply(): GridBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridBaseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridBaseProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
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
      
      inline def setDisableEqualOverflow(value: Boolean): Self = StObject.set(x, "disableEqualOverflow", value.asInstanceOf[js.Any])
      
      inline def setDisableEqualOverflowUndefined: Self = StObject.set(x, "disableEqualOverflow", js.undefined)
      
      inline def setRowSpacing(value: ResponsiveStyleValue[GridSpacing]): Self = StObject.set(x, "rowSpacing", value.asInstanceOf[js.Any])
      
      inline def setRowSpacingUndefined: Self = StObject.set(x, "rowSpacing", js.undefined)
      
      inline def setRowSpacingVarargs(value: (GridSpacing | Null)*): Self = StObject.set(x, "rowSpacing", js.Array(value*))
      
      inline def setSpacing(value: ResponsiveStyleValue[GridSpacing]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setSpacingVarargs(value: (GridSpacing | Null)*): Self = StObject.set(x, "spacing", js.Array(value*))
      
      inline def setWrap(value: GridWrap): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait GridDefaultBreakpoints extends StObject {
    
    /**
      * If a number, it sets the number of columns the grid item uses.
      * It can't be greater than the total number of columns of the container (12 by default).
      * If 'auto', the grid item's width matches its content.
      * If false, the prop is ignored.
      * If true, the grid item's width grows to use the space available in the grid container.
      * The value is applied for the `lg` breakpoint and wider screens if not overridden.
      * @default false
      */
    var lg: js.UndefOr[Boolean | GridSize] = js.undefined
    
    /**
      * If a number, it sets the margin-left equals to the number of columns the grid item uses.
      * If 'auto', the grid item push itself to the right-end of the container.
      * The value is applied for the `lg` breakpoint and wider screens if not overridden.
      */
    var lgOffset: js.UndefOr[GridSize] = js.undefined
    
    /**
      * If a number, it sets the number of columns the grid item uses.
      * It can't be greater than the total number of columns of the container (12 by default).
      * If 'auto', the grid item's width matches its content.
      * If false, the prop is ignored.
      * If true, the grid item's width grows to use the space available in the grid container.
      * The value is applied for the `md` breakpoint and wider screens if not overridden.
      * @default false
      */
    var md: js.UndefOr[Boolean | GridSize] = js.undefined
    
    /**
      * If a number, it sets the margin-left equals to the number of columns the grid item uses.
      * If 'auto', the grid item push itself to the right-end of the container.
      * The value is applied for the `md` breakpoint and wider screens if not overridden.
      */
    var mdOffset: js.UndefOr[GridSize] = js.undefined
    
    /**
      * If a number, it sets the number of columns the grid item uses.
      * It can't be greater than the total number of columns of the container (12 by default).
      * If 'auto', the grid item's width matches its content.
      * If false, the prop is ignored.
      * If true, the grid item's width grows to use the space available in the grid container.
      * The value is applied for the `sm` breakpoint and wider screens if not overridden.
      * @default false
      */
    var sm: js.UndefOr[Boolean | GridSize] = js.undefined
    
    /**
      * If a number, it sets the margin-left equals to the number of columns the grid item uses.
      * If 'auto', the grid item push itself to the right-end of the container.
      * The value is applied for the `sm` breakpoint and wider screens if not overridden.
      */
    var smOffset: js.UndefOr[GridSize] = js.undefined
    
    /**
      * If a number, it sets the number of columns the grid item uses.
      * It can't be greater than the total number of columns of the container (12 by default).
      * If 'auto', the grid item's width matches its content.
      * If false, the prop is ignored.
      * If true, the grid item's width grows to use the space available in the grid container.
      * The value is applied for the `xl` breakpoint and wider screens if not overridden.
      * @default false
      */
    var xl: js.UndefOr[Boolean | GridSize] = js.undefined
    
    /**
      * If a number, it sets the margin-left equals to the number of columns the grid item uses.
      * If 'auto', the grid item push itself to the right-end of the container.
      * The value is applied for the `xl` breakpoint and wider screens if not overridden.
      */
    var xlOffset: js.UndefOr[GridSize] = js.undefined
    
    /**
      * If a number, it sets the number of columns the grid item uses.
      * It can't be greater than the total number of columns of the container (12 by default).
      * If 'auto', the grid item's width matches its content.
      * If false, the prop is ignored.
      * If true, the grid item's width grows to use the space available in the grid container.
      * The value is applied for all the screen sizes with the lowest priority.
      * @default false
      */
    var xs: js.UndefOr[Boolean | GridSize] = js.undefined
    
    /**
      * If a number, it sets the margin-left equals to the number of columns the grid item uses.
      * If 'auto', the grid item push itself to the right-end of the container.
      * The value is applied for the `xs` breakpoint and wider screens if not overridden.
      */
    var xsOffset: js.UndefOr[GridSize] = js.undefined
  }
  object GridDefaultBreakpoints {
    
    inline def apply(): GridDefaultBreakpoints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridDefaultBreakpoints]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridDefaultBreakpoints] (val x: Self) extends AnyVal {
      
      inline def setLg(value: Boolean | GridSize): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgOffset(value: GridSize): Self = StObject.set(x, "lgOffset", value.asInstanceOf[js.Any])
      
      inline def setLgOffsetUndefined: Self = StObject.set(x, "lgOffset", js.undefined)
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: Boolean | GridSize): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdOffset(value: GridSize): Self = StObject.set(x, "mdOffset", value.asInstanceOf[js.Any])
      
      inline def setMdOffsetUndefined: Self = StObject.set(x, "mdOffset", js.undefined)
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: Boolean | GridSize): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmOffset(value: GridSize): Self = StObject.set(x, "smOffset", value.asInstanceOf[js.Any])
      
      inline def setSmOffsetUndefined: Self = StObject.set(x, "smOffset", js.undefined)
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: Boolean | GridSize): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlOffset(value: GridSize): Self = StObject.set(x, "xlOffset", value.asInstanceOf[js.Any])
      
      inline def setXlOffsetUndefined: Self = StObject.set(x, "xlOffset", js.undefined)
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: Boolean | GridSize): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsOffset(value: GridSize): Self = StObject.set(x, "xsOffset", value.asInstanceOf[js.Any])
      
      inline def setXsOffsetUndefined: Self = StObject.set(x, "xsOffset", js.undefined)
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
    }
  }
  
  object GridDirection {
    
    inline def column: "column" = "column".asInstanceOf["column"]
    
    inline def `column-reverse`: "column-reverse" = "column-reverse".asInstanceOf["column-reverse"]
    
    inline def row: "row" = "row".asInstanceOf["row"]
    
    inline def `row-reverse`: "row-reverse" = "row-reverse".asInstanceOf["row-reverse"]
  }
  type GridDirection = "row" | "row-reverse" | "column" | "column-reverse"
  
  type GridSize = "auto" | Double
  
  type GridSpacing = Double | String
  
  object GridWrap {
    
    inline def nowrap: "nowrap" = "nowrap".asInstanceOf["nowrap"]
    
    inline def wrap: "wrap" = "wrap".asInstanceOf["wrap"]
    
    inline def `wrap-reverse`: "wrap-reverse" = "wrap-reverse".asInstanceOf["wrap-reverse"]
  }
  type GridWrap = "nowrap" | "wrap" | "wrap-reverse"
  
  type ResponsiveStyleValue[T] = T | (js.Array[T | Null]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in @mui/system.@mui/system/createTheme/createBreakpoints.Breakpoint ]:? T | null} */ js.Any)
}
