package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.ColumnSpacing
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsGridTypeMapdiv
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.boxBoxMod.SystemProps
import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.Breakpoint
import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.BreakpointOverrides
import com.olvind.mui.muiTypes.mod.IfEquals
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Partial
import com.olvind.mui.std.Record
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridGridMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Grid](https://mui.com/material-ui/react-grid/)
    *
    * API:
    *
    * - [Grid API](https://mui.com/material-ui/api/grid/)
    */
  @JSImport("@mui/material/Grid/Grid", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsGridTypeMapdiv, Element] = js.native
  
  trait BreakpointOverridesEmpty extends StObject
  
  type Breakpoints = IfEquals[BreakpointOverrides, BreakpointOverridesEmpty, RegularBreakpoints, CustomBreakpoints]
  
  type CustomBreakpoints = Partial[Record[Breakpoint, Boolean | GridSize]]
  
  object GridDirection {
    
    inline def column: "column" = "column".asInstanceOf["column"]
    
    inline def `column-reverse`: "column-reverse" = "column-reverse".asInstanceOf["column-reverse"]
    
    inline def row: "row" = "row".asInstanceOf["row"]
    
    inline def `row-reverse`: "row-reverse" = "row-reverse".asInstanceOf["row-reverse"]
  }
  type GridDirection = "row" | "row-reverse" | "column" | "column-reverse"
  
  type GridProps[D /* <: ElementType */, P] = OverrideProps[GridTypeMap[P, D], D]
  
  type GridSize = "auto" | Double
  
  type GridSpacing = Double | String
  
  trait GridTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & SystemProps[Theme] & ColumnSpacing & Breakpoints
  }
  object GridTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & SystemProps[Theme] & ColumnSpacing & Breakpoints): GridTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridTypeMap[P, D]]
    }
    
    extension [Self <: GridTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (GridTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & SystemProps[Theme] & ColumnSpacing & Breakpoints): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  object GridWrap {
    
    inline def nowrap: "nowrap" = "nowrap".asInstanceOf["nowrap"]
    
    inline def wrap: "wrap" = "wrap".asInstanceOf["wrap"]
    
    inline def `wrap-reverse`: "wrap-reverse" = "wrap-reverse".asInstanceOf["wrap-reverse"]
  }
  type GridWrap = "nowrap" | "wrap" | "wrap-reverse"
  
  trait RegularBreakpoints extends StObject {
    
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
      * If a number, it sets the number of columns the grid item uses.
      * It can't be greater than the total number of columns of the container (12 by default).
      * If 'auto', the grid item's width matches its content.
      * If false, the prop is ignored.
      * If true, the grid item's width grows to use the space available in the grid container.
      * The value is applied for all the screen sizes with the lowest priority.
      * @default false
      */
    var xs: js.UndefOr[Boolean | GridSize] = js.undefined
  }
  object RegularBreakpoints {
    
    inline def apply(): RegularBreakpoints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegularBreakpoints]
    }
    
    extension [Self <: RegularBreakpoints](x: Self) {
      
      inline def setLg(value: Boolean | GridSize): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: Boolean | GridSize): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: Boolean | GridSize): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: Boolean | GridSize): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: Boolean | GridSize): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsGridTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `gridGridMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsGridTypeMapdiv, Element] = default
}
