package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.ChildrenClasses
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardContentTypeMapd
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardContentCardContentMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [CardContent API](https://mui.com/api/card-content/)
    */
  @JSImport("@mui/material/CardContent/CardContent", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardContentTypeMapd, Element] = js.native
  
  type CardContentProps[D /* <: ElementType */, P] = OverrideProps[CardContentTypeMap[P, D], D]
  
  @js.native
  trait CardContentTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with ChildrenClasses = js.native
  }
  object CardContentTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with ChildrenClasses): CardContentTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardContentTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class CardContentTypeMapMutableBuilder[Self <: CardContentTypeMap[_, _], P, D /* <: ElementType */] (val x: Self with (CardContentTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with ChildrenClasses): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsCardContentTypeMapd, Element]
  
  /* This means you don't have to write `default`, but can instead just say `cardContentCardContentMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsCardContentTypeMapd, Element] = default
}
