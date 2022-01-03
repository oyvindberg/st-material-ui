package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardMediaTypeMapdiv
import com.olvind.mui.muiMaterial.anon.Image
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMediaCardMediaMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [CardMedia API](https://mui.com/api/card-media/)
    */
  @JSImport("@mui/material/CardMedia/CardMedia", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardMediaTypeMapdiv, Element] = js.native
  
  type CardMediaProps[D /* <: ElementType */, P] = OverrideProps[CardMediaTypeMap[P, D], D]
  
  trait CardMediaTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Image
  }
  object CardMediaTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Image): CardMediaTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardMediaTypeMap[P, D]]
    }
    
    extension [Self <: CardMediaTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (CardMediaTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Image): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsCardMediaTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `cardMediaCardMediaMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsCardMediaTypeMapdiv, Element] = default
}
