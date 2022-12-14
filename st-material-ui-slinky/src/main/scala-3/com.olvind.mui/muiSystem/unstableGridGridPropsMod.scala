package com.olvind.mui.muiSystem

import com.olvind.mui.muiSystem.anon.Sx
import com.olvind.mui.muiSystem.boxBoxMod.SystemProps
import com.olvind.mui.muiSystem.createThemeCreateThemeMod.Theme
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unstableGridGridPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped <G>(): G extends @mui/system.@mui/system/createTheme/createBreakpoints.BreakpointOverrides ? 1 : 2 extends <G>(): G extends @mui/system.@mui/system/Unstable_Grid/GridProps.BreakpointOverridesEmpty ? 1 : 2 ? @mui/system.@mui/system/Unstable_Grid/GridProps.GridDefaultBreakpoints : @mui/system.@mui/system/Unstable_Grid/GridProps.CustomBreakpoints */ trait GridBaseProps extends StObject {
    
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
    
    extension [Self <: GridBaseProps](x: Self) {
      
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
  
  object GridDirection {
    
    inline def column: "column" = "column".asInstanceOf["column"]
    
    inline def `column-reverse`: "column-reverse" = "column-reverse".asInstanceOf["column-reverse"]
    
    inline def row: "row" = "row".asInstanceOf["row"]
    
    inline def `row-reverse`: "row-reverse" = "row-reverse".asInstanceOf["row-reverse"]
  }
  type GridDirection = "row" | "row-reverse" | "column" | "column-reverse"
  
  type GridSpacing = Double | String
  
  trait GridTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & GridBaseProps & Sx & SystemProps[Theme]
  }
  object GridTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & GridBaseProps & Sx & SystemProps[Theme]): GridTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridTypeMap[P, D]]
    }
    
    extension [Self <: GridTypeMap[?, ?], P, D /* <: ReactElement */](x: Self & (GridTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & GridBaseProps & Sx & SystemProps[Theme]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  object GridWrap {
    
    inline def nowrap: "nowrap" = "nowrap".asInstanceOf["nowrap"]
    
    inline def wrap: "wrap" = "wrap".asInstanceOf["wrap"]
    
    inline def `wrap-reverse`: "wrap-reverse" = "wrap-reverse".asInstanceOf["wrap-reverse"]
  }
  type GridWrap = "nowrap" | "wrap" | "wrap-reverse"
  
  type ResponsiveStyleValue[T] = T | (js.Array[T | Null]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in @mui/system.@mui/system/createTheme/createBreakpoints.Breakpoint ]:? T | null} */ js.Any)
}
