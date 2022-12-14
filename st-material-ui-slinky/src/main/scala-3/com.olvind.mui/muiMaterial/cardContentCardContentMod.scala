package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardContentTypeMapd
import com.olvind.mui.muiMaterial.anon.Sx
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardContentCardContentMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Card](https://mui.com/material-ui/react-card/)
    *
    * API:
    *
    * - [CardContent API](https://mui.com/material-ui/api/card-content/)
    */
  @JSImport("@mui/material/CardContent/CardContent", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardContentTypeMapd, Element] = js.native
  
  type CardContentProps[D /* <: ReactElement */, P] = OverrideProps[CardContentTypeMap[P, D], D]
  
  trait CardContentTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Sx
  }
  object CardContentTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Sx): CardContentTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardContentTypeMap[P, D]]
    }
    
    extension [Self <: CardContentTypeMap[?, ?], P, D /* <: ReactElement */](x: Self & (CardContentTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Sx): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsCardContentTypeMapd, Element]
  
  /* This means you don't have to write `default`, but can instead just say `cardContentCardContentMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsCardContentTypeMapd, Element] = default
}
