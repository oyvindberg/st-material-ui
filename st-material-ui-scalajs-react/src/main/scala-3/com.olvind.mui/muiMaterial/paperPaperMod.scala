package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsPaperTypeMapdiv
import com.olvind.mui.muiMaterial.anon.Elevation
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paperPaperMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Card](https://mui.com/material-ui/react-card/)
    * - [Paper](https://mui.com/material-ui/react-paper/)
    *
    * API:
    *
    * - [Paper API](https://mui.com/material-ui/api/paper/)
    */
  @JSImport("@mui/material/Paper/Paper", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsPaperTypeMapdiv, Element] = js.native
  
  type PaperProps[D /* <: ElementType */, P] = OverrideProps[PaperTypeMap[P, D], D]
  
  trait PaperPropsVariantOverrides extends StObject
  
  trait PaperTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Elevation
  }
  object PaperTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Elevation): PaperTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaperTypeMap[P, D]]
    }
    
    extension [Self <: PaperTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (PaperTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Elevation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsPaperTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `paperPaperMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsPaperTypeMapdiv, Element] = default
}
