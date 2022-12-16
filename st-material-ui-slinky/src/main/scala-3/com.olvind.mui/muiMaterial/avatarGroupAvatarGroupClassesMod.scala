package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarGroupAvatarGroupClassesMod {
  
  @JSImport("@mui/material/AvatarGroup/avatarGroupClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/AvatarGroup/avatarGroupClasses", JSImport.Default)
  @js.native
  val default: AvatarGroupClasses = js.native
  
  inline def getAvatarGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvatarGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AvatarGroupClassKey = "root" | "avatar"
  
  trait AvatarGroupClasses extends StObject {
    
    /** Styles applied to the avatar elements. */
    var avatar: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object AvatarGroupClasses {
    
    inline def apply(avatar: String, root: String): AvatarGroupClasses = {
      val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarGroupClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarGroupClasses] (val x: Self) extends AnyVal {
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
