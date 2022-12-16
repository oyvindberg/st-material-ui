package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsScopedCssBaselineTy
import com.olvind.mui.muiMaterial.anon.EnableColorScheme
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopedCssBaselineScopedCssBaselineMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [CSS Baseline](https://mui.com/material-ui/react-css-baseline/)
    *
    * API:
    *
    * - [ScopedCssBaseline API](https://mui.com/material-ui/api/scoped-css-baseline/)
    */
  @JSImport("@mui/material/ScopedCssBaseline/ScopedCssBaseline", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsScopedCssBaselineTy, Element] = js.native
  
  type ScopedCssBaselineProps[D /* <: ReactElement */, P] = OverrideProps[ScopedCssBaselineTypeMap[P, D], D]
  
  trait ScopedCssBaselineTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & EnableColorScheme
  }
  object ScopedCssBaselineTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & EnableColorScheme): ScopedCssBaselineTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScopedCssBaselineTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScopedCssBaselineTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (ScopedCssBaselineTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & EnableColorScheme): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsScopedCssBaselineTy, Element]
  
  /* This means you don't have to write `default`, but can instead just say `scopedCssBaselineScopedCssBaselineMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsScopedCssBaselineTy, Element] = default
}
