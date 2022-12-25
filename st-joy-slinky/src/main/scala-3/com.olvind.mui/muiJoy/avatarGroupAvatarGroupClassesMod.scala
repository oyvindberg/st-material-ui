package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarGroupAvatarGroupClassesMod {
  
  @JSImport("@mui/joy/AvatarGroup/avatarGroupClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/AvatarGroup/avatarGroupClasses", JSImport.Default)
  @js.native
  val default: AvatarGroupClasses = js.native
  
  inline def getAvatarGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvatarGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AvatarGroupClassKey = "root"
  
  trait AvatarGroupClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object AvatarGroupClasses {
    
    inline def apply(root: String): AvatarGroupClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarGroupClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarGroupClasses] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
