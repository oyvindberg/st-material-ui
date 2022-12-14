package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderSliderClassesMod {
  
  @JSImport("@mui/material/Slider/sliderClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Slider/sliderClasses", JSImport.Default)
  @js.native
  val default: SliderClasses = js.native
  
  inline def getSliderUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSliderUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type SliderClassKey = "root" | "colorPrimary" | "colorSecondary" | "marked" | "vertical" | "disabled" | "dragging" | "rail" | "track" | "trackFalse" | "trackInverted" | "thumb" | "active" | "focusVisible" | "mark" | "markActive" | "markLabel" | "markLabelActive" | "sizeSmall" | "thumbColorPrimary" | "thumbColorSecondary" | "thumbSizeSmall" | "valueLabel" | "valueLabelOpen" | "valueLabelCircle" | "valueLabelLabel"
  
  trait SliderClasses extends StObject {
    
    /** State class applied to the thumb element if it's active. */
    var active: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the root element if `color="secondary"`. */
    var colorSecondary: String
    
    /** State class applied to the root and thumb element if `disabled={true}`. */
    var disabled: String
    
    /** State class applied to the root if a thumb is being dragged. */
    var dragging: String
    
    /** State class applied to the thumb element if keyboard focused. */
    var focusVisible: String
    
    /** Styles applied to the mark element. */
    var mark: String
    
    /** Styles applied to the mark element if active (depending on the value). */
    var markActive: String
    
    /** Styles applied to the mark label element. */
    var markLabel: String
    
    /** Styles applied to the mark label element if active (depending on the value). */
    var markLabelActive: String
    
    /** Styles applied to the root element if `marks` is provided with at least one label. */
    var marked: String
    
    /** Styles applied to the rail element. */
    var rail: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String
    
    /** Styles applied to the thumb element. */
    var thumb: String
    
    /** Styles applied to the thumb element if `color="primary"`. */
    var thumbColorPrimary: String
    
    /** Styles applied to the thumb element if `color="secondary"`. */
    var thumbColorSecondary: String
    
    /** Styles applied to the thumb element if `size="small"`. */
    var thumbSizeSmall: String
    
    /** Styles applied to the track element. */
    var track: String
    
    /** Styles applied to the root element if `track={false}`. */
    var trackFalse: String
    
    /** Styles applied to the root element if `track="inverted"`. */
    var trackInverted: String
    
    /** Styles applied to the thumb label element. */
    var valueLabel: String
    
    /** Styles applied to the thumb label's circle element. */
    var valueLabelCircle: String
    
    /** Styles applied to the thumb label's label element. */
    var valueLabelLabel: String
    
    /** Styles applied to the thumb label element if it's open. */
    var valueLabelOpen: String
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String
  }
  object SliderClasses {
    
    inline def apply(
      active: String,
      colorPrimary: String,
      colorSecondary: String,
      disabled: String,
      dragging: String,
      focusVisible: String,
      mark: String,
      markActive: String,
      markLabel: String,
      markLabelActive: String,
      marked: String,
      rail: String,
      root: String,
      sizeSmall: String,
      thumb: String,
      thumbColorPrimary: String,
      thumbColorSecondary: String,
      thumbSizeSmall: String,
      track: String,
      trackFalse: String,
      trackInverted: String,
      valueLabel: String,
      valueLabelCircle: String,
      valueLabelLabel: String,
      valueLabelOpen: String,
      vertical: String
    ): SliderClasses = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], markActive = markActive.asInstanceOf[js.Any], markLabel = markLabel.asInstanceOf[js.Any], markLabelActive = markLabelActive.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any], rail = rail.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], thumbColorPrimary = thumbColorPrimary.asInstanceOf[js.Any], thumbColorSecondary = thumbColorSecondary.asInstanceOf[js.Any], thumbSizeSmall = thumbSizeSmall.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], trackFalse = trackFalse.asInstanceOf[js.Any], trackInverted = trackInverted.asInstanceOf[js.Any], valueLabel = valueLabel.asInstanceOf[js.Any], valueLabelCircle = valueLabelCircle.asInstanceOf[js.Any], valueLabelLabel = valueLabelLabel.asInstanceOf[js.Any], valueLabelOpen = valueLabelOpen.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderClasses] (val x: Self) extends AnyVal {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDragging(value: String): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkActive(value: String): Self = StObject.set(x, "markActive", value.asInstanceOf[js.Any])
      
      inline def setMarkLabel(value: String): Self = StObject.set(x, "markLabel", value.asInstanceOf[js.Any])
      
      inline def setMarkLabelActive(value: String): Self = StObject.set(x, "markLabelActive", value.asInstanceOf[js.Any])
      
      inline def setMarked(value: String): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
      
      inline def setRail(value: String): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      inline def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setThumbColorPrimary(value: String): Self = StObject.set(x, "thumbColorPrimary", value.asInstanceOf[js.Any])
      
      inline def setThumbColorSecondary(value: String): Self = StObject.set(x, "thumbColorSecondary", value.asInstanceOf[js.Any])
      
      inline def setThumbSizeSmall(value: String): Self = StObject.set(x, "thumbSizeSmall", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackFalse(value: String): Self = StObject.set(x, "trackFalse", value.asInstanceOf[js.Any])
      
      inline def setTrackInverted(value: String): Self = StObject.set(x, "trackInverted", value.asInstanceOf[js.Any])
      
      inline def setValueLabel(value: String): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
      
      inline def setValueLabelCircle(value: String): Self = StObject.set(x, "valueLabelCircle", value.asInstanceOf[js.Any])
      
      inline def setValueLabelLabel(value: String): Self = StObject.set(x, "valueLabelLabel", value.asInstanceOf[js.Any])
      
      inline def setValueLabelOpen(value: String): Self = StObject.set(x, "valueLabelOpen", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
