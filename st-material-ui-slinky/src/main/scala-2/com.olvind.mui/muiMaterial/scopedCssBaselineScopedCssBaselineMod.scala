package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsScopedCssBaselineTy
import com.olvind.mui.muiMaterial.anon.EnableColorScheme
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopedCssBaselineScopedCssBaselineMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Css Baseline](https://mui.com/components/css-baseline/)
    *
    * API:
    *
    * - [ScopedCssBaseline API](https://mui.com/api/scoped-css-baseline/)
    */
  @JSImport("@mui/material/ScopedCssBaseline/ScopedCssBaseline", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsScopedCssBaselineTy, Element] = js.native
  
  type ScopedCssBaselineProps[D /* <: ReactElement */, P] = OverrideProps[ScopedCssBaselineTypeMap[P, D], D]
  
  @js.native
  trait ScopedCssBaselineTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with EnableColorScheme = js.native
  }
  object ScopedCssBaselineTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with EnableColorScheme): ScopedCssBaselineTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScopedCssBaselineTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class ScopedCssBaselineTypeMapMutableBuilder[Self <: ScopedCssBaselineTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (ScopedCssBaselineTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with EnableColorScheme): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsScopedCssBaselineTy, Element]
  
  /* This means you don't have to write `default`, but can instead just say `scopedCssBaselineScopedCssBaselineMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsScopedCssBaselineTy, Element] = default
}
