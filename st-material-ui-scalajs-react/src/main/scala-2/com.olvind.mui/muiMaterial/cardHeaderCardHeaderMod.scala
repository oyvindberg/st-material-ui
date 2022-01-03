package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Avatar
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardHeaderTypeMapdi
import com.olvind.mui.muiMaterial.anon.`8`
import com.olvind.mui.muiMaterial.muiMaterialStrings.div
import com.olvind.mui.muiMaterial.muiMaterialStrings.span
import com.olvind.mui.muiMaterial.overridableComponentMod.OverridableComponent
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardHeaderCardHeaderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [CardHeader API](https://mui.com/api/card-header/)
    */
  @JSImport("@mui/material/CardHeader/CardHeader", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardHeaderTypeMapdi, Element] = js.native
  
  type CardHeaderProps[DefaultComponent /* <: ElementType */, Props, TitleTypographyComponent /* <: ElementType */, SubheaderTypographyComponent /* <: ElementType */] = OverrideProps[
    CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent], 
    DefaultComponent
  ]
  
  type CardHeaderPropsWithComponent[DefaultComponent /* <: ElementType */, Props, TitleTypographyComponent /* <: ElementType */, SubheaderTypographyComponent /* <: ElementType */] = `8`[DefaultComponent] with (CardHeaderProps[DefaultComponent, Props, TitleTypographyComponent, SubheaderTypographyComponent])
  
  @js.native
  trait CardHeaderTypeMap[Props, DefaultComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */, SubheaderTypographyComponent /* <: ElementType */] extends StObject {
    
    var defaultComponent: DefaultComponent = js.native
    
    var props: Props with (Avatar[SubheaderTypographyComponent, TitleTypographyComponent]) = js.native
  }
  object CardHeaderTypeMap {
    
    @scala.inline
    def apply[Props, DefaultComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */, SubheaderTypographyComponent /* <: ElementType */](
      defaultComponent: DefaultComponent,
      props: Props with (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])
    ): CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent]]
    }
    
    @scala.inline
    implicit class CardHeaderTypeMapMutableBuilder[Self <: CardHeaderTypeMap[_, _, _, _], Props, DefaultComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */, SubheaderTypographyComponent /* <: ElementType */] (val x: Self with (CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: DefaultComponent): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: Props with (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OverridableCardHeader
    extends OverridableComponent[CardHeaderTypeMap[js.Object, div, span, span]] {
    
    def apply[DefaultComponent /* <: ElementType */, Props, TitleTypographyComponent /* <: ElementType */, SubheaderTypographyComponent /* <: ElementType */](
      props: CardHeaderPropsWithComponent[DefaultComponent, Props, TitleTypographyComponent, SubheaderTypographyComponent]
    ): Element = js.native
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsCardHeaderTypeMapdi, Element]
  
  /* This means you don't have to write `default`, but can instead just say `cardHeaderCardHeaderMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsCardHeaderTypeMapdi, Element] = default
}
