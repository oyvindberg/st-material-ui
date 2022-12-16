package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Alt
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsAvatarTypeMapdiv
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
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
  
  type AvatarProps[D /* <: ElementType */, P] = OverrideProps[AvatarTypeMap[P, D], D]
  
  trait AvatarPropsVariantOverrides extends StObject
  
  trait AvatarTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Alt
  }
  object AvatarTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Alt): AvatarTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (AvatarTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Alt): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsAvatarTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `avatarAvatarMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsAvatarTypeMapdiv, Element] = default
}
