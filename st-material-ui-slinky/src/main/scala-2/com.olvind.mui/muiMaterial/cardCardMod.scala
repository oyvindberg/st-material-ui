package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DistributiveOmitPaperPropsPaperTypeMapdiAbout
import com.olvind.mui.muiMaterial.anon.Raised
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardCardMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [Card API](https://mui.com/api/card/)
    * - inherits [Paper API](https://mui.com/api/paper/)
    */
  @JSImport("@mui/material/Card/Card", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardTypeMapdiv, Element] = js.native
  
  type CardProps[D /* <: ReactElement */, P] = OverrideProps[CardTypeMap[P, D], D]
  
  @js.native
  trait CardPropsColorOverrides extends StObject
  
  @js.native
  trait CardTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with DistributiveOmitPaperPropsPaperTypeMapdiAbout with Raised = js.native
  }
  object CardTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with DistributiveOmitPaperPropsPaperTypeMapdiAbout with Raised): CardTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class CardTypeMapMutableBuilder[Self <: CardTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (CardTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with DistributiveOmitPaperPropsPaperTypeMapdiAbout with Raised): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsCardTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `cardCardMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsCardTypeMapdiv, Element] = default
}
