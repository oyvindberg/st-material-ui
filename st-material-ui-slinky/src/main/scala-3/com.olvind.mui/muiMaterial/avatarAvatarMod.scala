package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Alt
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsAvatarTypeMapdiv
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarAvatarMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Avatar](https://mui.com/material-ui/react-avatar/)
    *
    * API:
    *
    * - [Avatar API](https://mui.com/material-ui/api/avatar/)
    */
  @JSImport("@mui/material/Avatar/Avatar", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAvatarTypeMapdiv, Element] = js.native
  
  type AvatarProps[D /* <: ReactElement */, P] = OverrideProps[AvatarTypeMap[P, D], D]
  
  trait AvatarPropsVariantOverrides extends StObject
  
  trait AvatarTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Alt
  }
  object AvatarTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Alt): AvatarTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarTypeMap[P, D]]
    }
    
    extension [Self <: AvatarTypeMap[?, ?], P, D /* <: ReactElement */](x: Self & (AvatarTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Alt): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsAvatarTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `avatarAvatarMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsAvatarTypeMapdiv, Element] = default
}
