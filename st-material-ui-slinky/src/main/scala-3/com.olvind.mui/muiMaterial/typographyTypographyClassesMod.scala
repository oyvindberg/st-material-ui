package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyTypographyClassesMod {
  
  @JSImport("@mui/material/Typography/typographyClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Typography/typographyClasses", JSImport.Default)
  @js.native
  val default: TypographyClasses = js.native
  
  inline def getTypographyUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypographyUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TypographyClassKey = "root" | "body2" | "body1" | "caption" | "button" | "h1" | "h2" | "h3" | "h4" | "h5" | "h6" | "subtitle1" | "subtitle2" | "overline" | "inherit" | "alignLeft" | "alignCenter" | "alignRight" | "alignJustify" | "noWrap" | "gutterBottom" | "paragraph"
  
  trait TypographyClasses extends StObject {
    
    /** Styles applied to the root element if `align="center"`. */
    var alignCenter: String
    
    /** Styles applied to the root element if `align="justify"`. */
    var alignJustify: String
    
    /** Styles applied to the root element if `align="left"`. */
    var alignLeft: String
    
    /** Styles applied to the root element if `align="right"`. */
    var alignRight: String
    
    /** Styles applied to the root element if `variant="body1"`. */
    var body1: String
    
    /** Styles applied to the root element if `variant="body2"`. */
    var body2: String
    
    /** Styles applied to the root element if `variant="button"`. */
    var button: String
    
    /** Styles applied to the root element if `variant="caption"`. */
    var caption: String
    
    /** Styles applied to the root element if `gutterBottom={true}`. */
    var gutterBottom: String
    
    /** Styles applied to the root element if `variant="h1"`. */
    var h1: String
    
    /** Styles applied to the root element if `variant="h2"`. */
    var h2: String
    
    /** Styles applied to the root element if `variant="h3"`. */
    var h3: String
    
    /** Styles applied to the root element if `variant="h4"`. */
    var h4: String
    
    /** Styles applied to the root element if `variant="h5"`. */
    var h5: String
    
    /** Styles applied to the root element if `variant="h6"`. */
    var h6: String
    
    /** Styles applied to the root element if `variant="inherit"`. */
    var inherit: String
    
    /** Styles applied to the root element if `nowrap={true}`. */
    var noWrap: String
    
    /** Styles applied to the root element if `variant="overline"`. */
    var overline: String
    
    /** Styles applied to the root element if `paragraph={true}`. */
    var paragraph: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `variant="subtitle1"`. */
    var subtitle1: String
    
    /** Styles applied to the root element if `variant="subtitle2"`. */
    var subtitle2: String
  }
  object TypographyClasses {
    
    inline def apply(
      alignCenter: String,
      alignJustify: String,
      alignLeft: String,
      alignRight: String,
      body1: String,
      body2: String,
      button: String,
      caption: String,
      gutterBottom: String,
      h1: String,
      h2: String,
      h3: String,
      h4: String,
      h5: String,
      h6: String,
      inherit: String,
      noWrap: String,
      overline: String,
      paragraph: String,
      root: String,
      subtitle1: String,
      subtitle2: String
    ): TypographyClasses = {
      val __obj = js.Dynamic.literal(alignCenter = alignCenter.asInstanceOf[js.Any], alignJustify = alignJustify.asInstanceOf[js.Any], alignLeft = alignLeft.asInstanceOf[js.Any], alignRight = alignRight.asInstanceOf[js.Any], body1 = body1.asInstanceOf[js.Any], body2 = body2.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], gutterBottom = gutterBottom.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], noWrap = noWrap.asInstanceOf[js.Any], overline = overline.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], subtitle1 = subtitle1.asInstanceOf[js.Any], subtitle2 = subtitle2.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypographyClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypographyClasses] (val x: Self) extends AnyVal {
      
      inline def setAlignCenter(value: String): Self = StObject.set(x, "alignCenter", value.asInstanceOf[js.Any])
      
      inline def setAlignJustify(value: String): Self = StObject.set(x, "alignJustify", value.asInstanceOf[js.Any])
      
      inline def setAlignLeft(value: String): Self = StObject.set(x, "alignLeft", value.asInstanceOf[js.Any])
      
      inline def setAlignRight(value: String): Self = StObject.set(x, "alignRight", value.asInstanceOf[js.Any])
      
      inline def setBody1(value: String): Self = StObject.set(x, "body1", value.asInstanceOf[js.Any])
      
      inline def setBody2(value: String): Self = StObject.set(x, "body2", value.asInstanceOf[js.Any])
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setGutterBottom(value: String): Self = StObject.set(x, "gutterBottom", value.asInstanceOf[js.Any])
      
      inline def setH1(value: String): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH2(value: String): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH3(value: String): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH4(value: String): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH5(value: String): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH6(value: String): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setInherit(value: String): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
      
      inline def setNoWrap(value: String): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      inline def setOverline(value: String): Self = StObject.set(x, "overline", value.asInstanceOf[js.Any])
      
      inline def setParagraph(value: String): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSubtitle1(value: String): Self = StObject.set(x, "subtitle1", value.asInstanceOf[js.Any])
      
      inline def setSubtitle2(value: String): Self = StObject.set(x, "subtitle2", value.asInstanceOf[js.Any])
    }
  }
}
