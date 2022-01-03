package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarGroupClassesMod {
  
  @JSImport("@mui/material/AvatarGroup/avatarGroupClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/AvatarGroup/avatarGroupClasses", JSImport.Default)
  @js.native
  val default: AvatarGroupClasses = js.native
  
  @scala.inline
  def getAvatarGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvatarGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.avatar
  */
  trait AvatarGroupClassKey extends StObject
  
  @js.native
  trait AvatarGroupClasses extends StObject {
    
    /** Styles applied to the avatar elements. */
    var avatar: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object AvatarGroupClasses {
    
    @scala.inline
    def apply(avatar: String, root: String): AvatarGroupClasses = {
      val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarGroupClasses]
    }
    
    @scala.inline
    implicit class AvatarGroupClassesMutableBuilder[Self <: AvatarGroupClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
