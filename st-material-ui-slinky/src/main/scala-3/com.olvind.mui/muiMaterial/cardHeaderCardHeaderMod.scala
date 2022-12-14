package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Avatar
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardHeaderTypeMapdi
import com.olvind.mui.muiMaterial.anon.`7`
import com.olvind.mui.muiMaterial.overridableComponentMod.OverridableComponent
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardHeaderCardHeaderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Card](https://mui.com/material-ui/react-card/)
    *
    * API:
    *
    * - [CardHeader API](https://mui.com/material-ui/api/card-header/)
    */
  @JSImport("@mui/material/CardHeader/CardHeader", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardHeaderTypeMapdi, Element] = js.native
  
  type CardHeaderProps[DefaultComponent /* <: ReactElement */, Props, TitleTypographyComponent /* <: ReactElement */, SubheaderTypographyComponent /* <: ReactElement */] = OverrideProps[
    CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent], 
    DefaultComponent
  ]
  
  type CardHeaderPropsWithComponent[DefaultComponent /* <: ReactElement */, Props, TitleTypographyComponent /* <: ReactElement */, SubheaderTypographyComponent /* <: ReactElement */] = `7`[DefaultComponent] & (CardHeaderProps[DefaultComponent, Props, TitleTypographyComponent, SubheaderTypographyComponent])
  
  trait CardHeaderTypeMap[Props, DefaultComponent /* <: ReactElement */, TitleTypographyComponent /* <: ReactElement */, SubheaderTypographyComponent /* <: ReactElement */] extends StObject {
    
    var defaultComponent: DefaultComponent
    
    var props: Props & (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])
  }
  object CardHeaderTypeMap {
    
    inline def apply[Props, DefaultComponent /* <: ReactElement */, TitleTypographyComponent /* <: ReactElement */, SubheaderTypographyComponent /* <: ReactElement */](
      defaultComponent: DefaultComponent,
      props: Props & (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])
    ): CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent]]
    }
    
    extension [Self <: CardHeaderTypeMap[?, ?, ?, ?], Props, DefaultComponent /* <: ReactElement */, TitleTypographyComponent /* <: ReactElement */, SubheaderTypographyComponent /* <: ReactElement */](x: Self & (CardHeaderTypeMap[Props, DefaultComponent, TitleTypographyComponent, SubheaderTypographyComponent])) {
      
      inline def setDefaultComponent(value: DefaultComponent): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props & (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OverridableCardHeader
    extends OverridableComponent[CardHeaderTypeMap[js.Object, "div", "span", "span"]] {
    
    def apply[DefaultComponent /* <: ReactElement */, Props, TitleTypographyComponent /* <: ReactElement */, SubheaderTypographyComponent /* <: ReactElement */](
      props: CardHeaderPropsWithComponent[DefaultComponent, Props, TitleTypographyComponent, SubheaderTypographyComponent]
    ): Element = js.native
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsCardHeaderTypeMapdi, Element]
  
  /* This means you don't have to write `default`, but can instead just say `cardHeaderCardHeaderMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsCardHeaderTypeMapdi, Element] = default
}
