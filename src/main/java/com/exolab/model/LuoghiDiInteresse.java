package com.exolab.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "luoghi_amp")
public class LuoghiDiInteresse {

    @Id
    private ObjectId id;
    private String codice;
    private String pathId;
    private String tipologia;
    private List<DettagliArea> coordinate;
    private DettagliArea it;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getPathId() {
        return pathId;
    }

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public List<DettagliArea> getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(List<DettagliArea> coordinate) {
        this.coordinate = coordinate;
    }

    public DettagliArea getIt() {
        return it;
    }

    public void setIt(DettagliArea it) {
        this.it = it;
    }
}
