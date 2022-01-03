package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/AvatarGroup/avatarGroupClasses.AvatarGroupClasses> */
trait PartialAvatarGroupClasses extends StObject {
  
  var avatar: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialAvatarGroupClasses {
  
  inline def apply(): PartialAvatarGroupClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAvatarGroupClasses]
  }
  
  extension [Self <: PartialAvatarGroupClasses](x: Self) {
    
    inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
