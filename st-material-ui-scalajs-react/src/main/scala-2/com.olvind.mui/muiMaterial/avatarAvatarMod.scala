package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Alt
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsAvatarTypeMapdiv
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarAvatarMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Avatars](https://mui.com/components/avatars/)
    *
    * API:
    *
    * - [Avatar API](https://mui.com/api/avatar/)
    */
  @JSImport("@mui/material/Avatar/Avatar", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAvatarTypeMapdiv, Element] = js.native
  
  type AvatarProps[D /* <: ElementType */, P] = OverrideProps[AvatarTypeMap[P, D], D]
  
  @js.native
  trait AvatarPropsVariantOverrides extends StObject
  
  @js.native
  trait AvatarTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with Alt = js.native
  }
  object AvatarTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with Alt): AvatarTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class AvatarTypeMapMutableBuilder[Self <: AvatarTypeMap[_, _], P, D /* <: ElementType */] (val x: Self with (AvatarTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with Alt): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsAvatarTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `avatarAvatarMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsAvatarTypeMapdiv, Element] = default
}
