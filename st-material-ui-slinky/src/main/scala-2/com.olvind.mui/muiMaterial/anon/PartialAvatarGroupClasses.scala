package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/AvatarGroup/avatarGroupClasses.AvatarGroupClasses> */
@js.native
trait PartialAvatarGroupClasses extends StObject {
  
  var avatar: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialAvatarGroupClasses {
  
  @scala.inline
  def apply(): PartialAvatarGroupClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAvatarGroupClasses]
  }
  
  @scala.inline
  implicit class PartialAvatarGroupClassesMutableBuilder[Self <: PartialAvatarGroupClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
