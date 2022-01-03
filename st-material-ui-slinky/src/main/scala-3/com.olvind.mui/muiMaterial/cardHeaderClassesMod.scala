package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardHeaderClassesMod {
  
  @JSImport("@mui/material/CardHeader/cardHeaderClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/CardHeader/cardHeaderClasses", JSImport.Default)
  @js.native
  val default: CardHeaderClasses = js.native
  
  inline def getCardHeaderUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardHeaderUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.avatar
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.action
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.content
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.title
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.subheader
  */
  trait CardHeaderClassKey extends StObject
  
  trait CardHeaderClasses extends StObject {
    
    /** Styles applied to the action element. */
    var action: String
    
    /** Styles applied to the avatar element. */
    var avatar: String
    
    /** Styles applied to the content wrapper element. */
    var content: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the subheader Typography element. */
    var subheader: String
    
    /** Styles applied to the title Typography element. */
    var title: String
  }
  object CardHeaderClasses {
    
    inline def apply(action: String, avatar: String, content: String, root: String, subheader: String, title: String): CardHeaderClasses = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], subheader = subheader.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardHeaderClasses]
    }
    
    extension [Self <: CardHeaderClasses](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSubheader(value: String): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
