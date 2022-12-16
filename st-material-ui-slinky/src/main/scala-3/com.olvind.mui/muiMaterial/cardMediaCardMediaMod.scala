package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardMediaTypeMapdiv
import com.olvind.mui.muiMaterial.anon.Image
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMediaCardMediaMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Card](https://mui.com/material-ui/react-card/)
    *
    * API:
    *
    * - [CardMedia API](https://mui.com/material-ui/api/card-media/)
    */
  @JSImport("@mui/material/CardMedia/CardMedia", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardMediaTypeMapdiv, Element] = js.native
  
  type CardMediaProps[D /* <: ReactElement */, P] = OverrideProps[CardMediaTypeMap[P, D], D]
  
  trait CardMediaTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Image
  }
  object CardMediaTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Image): CardMediaTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardMediaTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardMediaTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (CardMediaTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Image): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsCardMediaTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `cardMediaCardMediaMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsCardMediaTypeMapdiv, Element] = default
}
