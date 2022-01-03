package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsPaperTypeMapdiv
import com.olvind.mui.muiMaterial.anon.Elevation
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paperPaperMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    * - [Paper](https://mui.com/components/paper/)
    *
    * API:
    *
    * - [Paper API](https://mui.com/api/paper/)
    */
  @JSImport("@mui/material/Paper/Paper", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsPaperTypeMapdiv, Element] = js.native
  
  type PaperProps[D /* <: ReactElement */, P] = OverrideProps[PaperTypeMap[P, D], D]
  
  @js.native
  trait PaperPropsVariantOverrides extends StObject
  
  @js.native
  trait PaperTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with Elevation = js.native
  }
  object PaperTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with Elevation): PaperTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaperTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class PaperTypeMapMutableBuilder[Self <: PaperTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (PaperTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with Elevation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsPaperTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `paperPaperMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsPaperTypeMapdiv, Element] = default
}
