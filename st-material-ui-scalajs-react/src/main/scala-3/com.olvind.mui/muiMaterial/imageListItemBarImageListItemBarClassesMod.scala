package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListItemBarImageListItemBarClassesMod {
  
  @JSImport("@mui/material/ImageListItemBar/imageListItemBarClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ImageListItemBar/imageListItemBarClasses", JSImport.Default)
  @js.native
  val default: ImageListItemBarClasses = js.native
  
  inline def getImageListItemBarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageListItemBarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ImageListItemBarClassKey = "root" | "positionBottom" | "positionTop" | "positionBelow" | "titleWrap" | "titleWrapBelow" | "titleWrapActionPosLeft" | "titleWrapActionPosRight" | "title" | "subtitle" | "actionIcon" | "actionIconActionPosLeft"
  
  trait ImageListItemBarClasses extends StObject {
    
    /** Styles applied to the actionIcon if supplied. */
    var actionIcon: String
    
    /** Styles applied to the actionIcon if `actionPosition="left"`. */
    var actionIconActionPosLeft: String
    
    /** Styles applied to the root element if `position="below"`. */
    var positionBelow: String
    
    /** Styles applied to the root element if `position="bottom"`. */
    var positionBottom: String
    
    /** Styles applied to the root element if `position="top"`. */
    var positionTop: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the subtitle container element. */
    var subtitle: String
    
    /** Styles applied to the title container element. */
    var title: String
    
    /** Styles applied to the title and subtitle container element. */
    var titleWrap: String
    
    /** Styles applied to the container element if `actionPosition="left"`. */
    var titleWrapActionPosLeft: String
    
    /** Styles applied to the container element if `actionPosition="right"`. */
    var titleWrapActionPosRight: String
    
    /** Styles applied to the title and subtitle container element if `position="below"`. */
    var titleWrapBelow: String
  }
  object ImageListItemBarClasses {
    
    inline def apply(
      actionIcon: String,
      actionIconActionPosLeft: String,
      positionBelow: String,
      positionBottom: String,
      positionTop: String,
      root: String,
      subtitle: String,
      title: String,
      titleWrap: String,
      titleWrapActionPosLeft: String,
      titleWrapActionPosRight: String,
      titleWrapBelow: String
    ): ImageListItemBarClasses = {
      val __obj = js.Dynamic.literal(actionIcon = actionIcon.asInstanceOf[js.Any], actionIconActionPosLeft = actionIconActionPosLeft.asInstanceOf[js.Any], positionBelow = positionBelow.asInstanceOf[js.Any], positionBottom = positionBottom.asInstanceOf[js.Any], positionTop = positionTop.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleWrap = titleWrap.asInstanceOf[js.Any], titleWrapActionPosLeft = titleWrapActionPosLeft.asInstanceOf[js.Any], titleWrapActionPosRight = titleWrapActionPosRight.asInstanceOf[js.Any], titleWrapBelow = titleWrapBelow.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageListItemBarClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageListItemBarClasses] (val x: Self) extends AnyVal {
      
      inline def setActionIcon(value: String): Self = StObject.set(x, "actionIcon", value.asInstanceOf[js.Any])
      
      inline def setActionIconActionPosLeft(value: String): Self = StObject.set(x, "actionIconActionPosLeft", value.asInstanceOf[js.Any])
      
      inline def setPositionBelow(value: String): Self = StObject.set(x, "positionBelow", value.asInstanceOf[js.Any])
      
      inline def setPositionBottom(value: String): Self = StObject.set(x, "positionBottom", value.asInstanceOf[js.Any])
      
      inline def setPositionTop(value: String): Self = StObject.set(x, "positionTop", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleWrap(value: String): Self = StObject.set(x, "titleWrap", value.asInstanceOf[js.Any])
      
      inline def setTitleWrapActionPosLeft(value: String): Self = StObject.set(x, "titleWrapActionPosLeft", value.asInstanceOf[js.Any])
      
      inline def setTitleWrapActionPosRight(value: String): Self = StObject.set(x, "titleWrapActionPosRight", value.asInstanceOf[js.Any])
      
      inline def setTitleWrapBelow(value: String): Self = StObject.set(x, "titleWrapBelow", value.asInstanceOf[js.Any])
    }
  }
}
