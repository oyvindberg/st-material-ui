package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardMediaTypeMapdiv
import com.olvind.mui.muiMaterial.anon.Image
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  type CardMediaProps[D /* <: ReactElement */, P] = OverrideProps[CardMediaTypeMap[P, D], D]
  
  @js.native
  trait CardMediaTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with Image = js.native
  }
  object CardMediaTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with Image): CardMediaTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardMediaTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class CardMediaTypeMapMutableBuilder[Self <: CardMediaTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (CardMediaTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with Image): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsCardMediaTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `cardMediaCardMediaMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsCardMediaTypeMapdiv, Element] = default
}
