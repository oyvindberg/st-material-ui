package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.avatarGroupAvatarGroupMod.AvatarGroupComponentsPropsOverrides
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalAvatar extends StObject {
  
  var additionalAvatar: js.UndefOr[
    (ComponentPropsWithRef[js.Function1[/* props */ DefaultComponentPropsAvatarTypeMapdiv, Element]]) & AvatarGroupComponentsPropsOverrides
  ] = js.undefined
}
object AdditionalAvatar {
  
  inline def apply(): AdditionalAvatar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalAvatar]
  }
  
  extension [Self <: AdditionalAvatar](x: Self) {
    
    inline def setAdditionalAvatar(
      value: (ComponentPropsWithRef[js.Function1[/* props */ DefaultComponentPropsAvatarTypeMapdiv, Element]]) & AvatarGroupComponentsPropsOverrides
    ): Self = StObject.set(x, "additionalAvatar", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAvatarUndefined: Self = StObject.set(x, "additionalAvatar", js.undefined)
  }
}
