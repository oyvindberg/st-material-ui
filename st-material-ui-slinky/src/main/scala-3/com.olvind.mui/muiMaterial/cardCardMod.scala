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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardCardMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Card](https://mui.com/material-ui/react-card/)
    *
    * API:
    *
    * - [Card API](https://mui.com/material-ui/api/card/)
    * - inherits [Paper API](https://mui.com/material-ui/api/paper/)
    */
  @JSImport("@mui/material/Card/Card", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardTypeMapdiv, Element] = js.native
  
  type CardProps[D /* <: ReactElement */, P] = OverrideProps[CardTypeMap[P, D], D]
  
  trait CardPropsColorOverrides extends StObject
  
  trait CardTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & DistributiveOmitPaperPropsPaperTypeMapdiAbout & Raised
  }
  object CardTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & DistributiveOmitPaperPropsPaperTypeMapdiAbout & Raised): CardTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (CardTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DistributiveOmitPaperPropsPaperTypeMapdiAbout & Raised): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsCardTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `cardCardMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsCardTypeMapdiv, Element] = default
}
