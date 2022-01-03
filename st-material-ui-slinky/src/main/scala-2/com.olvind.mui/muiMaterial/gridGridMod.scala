package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.ColumnSpacing
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsGridTypeMapdiv
import com.olvind.mui.muiMaterial.createThemeMod.Theme
import com.olvind.mui.muiMaterial.muiMaterialStrings.auto
import com.olvind.mui.muiMaterial.muiMaterialStrings.nowrap_
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.muiSystem.boxBoxMod.SystemProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridGridMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Grid](https://mui.com/components/grid/)
    *
    * API:
    *
    * - [Grid API](https://mui.com/api/grid/)
    */
  @JSImport("@mui/material/Grid/Grid", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsGridTypeMapdiv, Element] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.row
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`row-reverse`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.column
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`column-reverse`
  */
  trait GridDirection extends StObject
  object GridDirection {
    
    @scala.inline
    def column: com.olvind.mui.muiMaterial.muiMaterialStrings.column = "column".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.column]
    
    @scala.inline
    def `column-reverse`: com.olvind.mui.muiMaterial.muiMaterialStrings.`column-reverse` = "column-reverse".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.`column-reverse`]
    
    @scala.inline
    def row: com.olvind.mui.muiMaterial.muiMaterialStrings.row = "row".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.row]
    
    @scala.inline
    def `row-reverse`: com.olvind.mui.muiMaterial.muiMaterialStrings.`row-reverse` = "row-reverse".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.`row-reverse`]
  }
  
  type GridProps[D /* <: ReactElement */, P] = OverrideProps[GridTypeMap[P, D], D]
  
  type GridSize = auto | Double
  
  type GridSpacing = Double | String
  
  @js.native
  trait GridTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with SystemProps[Theme] with ColumnSpacing = js.native
  }
  object GridTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with SystemProps[Theme] with ColumnSpacing): GridTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class GridTypeMapMutableBuilder[Self <: GridTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (GridTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with SystemProps[Theme] with ColumnSpacing): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.nowrap_
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.wrap
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`wrap-reverse`
  */
  trait GridWrap extends StObject
  object GridWrap {
    
    @scala.inline
    def nowrap: nowrap_ = "nowrap".asInstanceOf[nowrap_]
    
    @scala.inline
    def wrap: com.olvind.mui.muiMaterial.muiMaterialStrings.wrap = "wrap".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.wrap]
    
    @scala.inline
    def `wrap-reverse`: com.olvind.mui.muiMaterial.muiMaterialStrings.`wrap-reverse` = "wrap-reverse".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.`wrap-reverse`]
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsGridTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `gridGridMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsGridTypeMapdiv, Element] = default
}
